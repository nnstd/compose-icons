package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WallSconce: ImageVector
    get() {
        if (_WallSconce != null) {
            return _WallSconce!!
        }
        _WallSconce = ImageVector.Builder(
            name = "WallSconce",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 4f)
                lineTo(7f, 13f)
                horizontalLineTo(19f)
                lineTo(15f, 4f)
                horizontalLineTo(11f)
                moveTo(4f, 14f)
                verticalLineTo(22f)
                horizontalLineTo(6f)
                verticalLineTo(19f)
                horizontalLineTo(14f)
                verticalLineTo(14f)
                horizontalLineTo(12f)
                verticalLineTo(17f)
                horizontalLineTo(6f)
                verticalLineTo(14f)
                horizontalLineTo(4f)
                close()
            }
        }.build()

        return _WallSconce!!
    }

@Suppress("ObjectPropertyName")
private var _WallSconce: ImageVector? = null
