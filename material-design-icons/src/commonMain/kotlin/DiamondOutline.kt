package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DiamondOutline: ImageVector
    get() {
        if (_DiamondOutline != null) {
            return _DiamondOutline!!
        }
        _DiamondOutline = ImageVector.Builder(
            name = "DiamondOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 2f)
                horizontalLineTo(6f)
                lineTo(2f, 8f)
                lineTo(12f, 22f)
                lineTo(22f, 8f)
                lineTo(18f, 2f)
                moveTo(4.43f, 8f)
                lineTo(7.07f, 4f)
                horizontalLineTo(16.93f)
                lineTo(19.57f, 8f)
                lineTo(12f, 18.56f)
                lineTo(4.43f, 8f)
                close()
            }
        }.build()

        return _DiamondOutline!!
    }

@Suppress("ObjectPropertyName")
private var _DiamondOutline: ImageVector? = null
