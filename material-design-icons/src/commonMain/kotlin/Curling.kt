package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Curling: ImageVector
    get() {
        if (_Curling != null) {
            return _Curling!!
        }
        _Curling = ImageVector.Builder(
            name = "Curling",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 3f)
                verticalLineTo(5f)
                curveTo(12.5f, 5f, 13.9f, 5.05f, 14.72f, 5.41f)
                curveTo(15.26f, 5.65f, 15.73f, 6.21f, 16.25f, 7f)
                horizontalLineTo(5f)
                verticalLineTo(9f)
                horizontalLineTo(19.62f)
                lineTo(18.89f, 7.55f)
                curveTo(17.86f, 5.5f, 16.96f, 4.22f, 15.53f, 3.59f)
                curveTo(14.1f, 2.95f, 12.5f, 3f, 10f, 3f)
                moveTo(6f, 11f)
                curveTo(3.78f, 11f, 2f, 12.78f, 2f, 15f)
                verticalLineTo(18f)
                curveTo(2f, 20.22f, 3.78f, 22f, 6f, 22f)
                horizontalLineTo(18f)
                curveTo(20.22f, 22f, 22f, 20.22f, 22f, 18f)
                verticalLineTo(15f)
                curveTo(22f, 12.78f, 20.22f, 11f, 18f, 11f)
                horizontalLineTo(6f)
                close()
            }
        }.build()

        return _Curling!!
    }

@Suppress("ObjectPropertyName")
private var _Curling: ImageVector? = null
