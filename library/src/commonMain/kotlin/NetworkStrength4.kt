package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.NetworkStrength4: ImageVector
    get() {
        if (_NetworkStrength4 != null) {
            return _NetworkStrength4!!
        }
        _NetworkStrength4 = ImageVector.Builder(
            name = "NetworkStrength4",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1f, 21f)
                horizontalLineTo(21f)
                verticalLineTo(1f)
            }
        }.build()

        return _NetworkStrength4!!
    }

@Suppress("ObjectPropertyName")
private var _NetworkStrength4: ImageVector? = null
