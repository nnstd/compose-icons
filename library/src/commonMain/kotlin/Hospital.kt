package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Hospital: ImageVector
    get() {
        if (_Hospital != null) {
            return _Hospital!!
        }
        _Hospital = ImageVector.Builder(
            name = "Hospital",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 14f)
                horizontalLineTo(14f)
                verticalLineTo(18f)
                horizontalLineTo(10f)
                verticalLineTo(14f)
                horizontalLineTo(6f)
                verticalLineTo(10f)
                horizontalLineTo(10f)
                verticalLineTo(6f)
                horizontalLineTo(14f)
                verticalLineTo(10f)
                horizontalLineTo(18f)
            }
        }.build()

        return _Hospital!!
    }

@Suppress("ObjectPropertyName")
private var _Hospital: ImageVector? = null
