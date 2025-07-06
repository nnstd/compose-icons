package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SeedPlus: ImageVector
    get() {
        if (_SeedPlus != null) {
            return _SeedPlus!!
        }
        _SeedPlus = ImageVector.Builder(
            name = "SeedPlus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 17f)
                horizontalLineTo(14f)
                verticalLineTo(19f)
                horizontalLineTo(17f)
                verticalLineTo(22f)
                horizontalLineTo(19f)
                verticalLineTo(19f)
                horizontalLineTo(22f)
                verticalLineTo(17f)
                horizontalLineTo(19f)
                verticalLineTo(14f)
                horizontalLineTo(17f)
                verticalLineTo(17f)
                moveTo(12f, 18f)
                curveTo(12f, 14.69f, 14.69f, 12f, 18f, 12f)
                curveTo(18.77f, 12f, 19.5f, 12.15f, 20.17f, 12.41f)
                curveTo(21.63f, 7.9f, 20.7f, 3.3f, 20.7f, 3.3f)
                reflectiveCurveTo(19.3f, 3f, 17.2f, 3f)
                curveTo(11.7f, 3f, 1.6f, 5.1f, 3.2f, 20.8f)
                curveTo(4.3f, 20.9f, 5.4f, 21f, 6.4f, 21f)
                curveTo(8.76f, 21f, 10.74f, 20.69f, 12.41f, 20.15f)
                curveTo(12.15f, 19.5f, 12f, 18.76f, 12f, 18f)
                moveTo(7f, 17f)
                curveTo(7f, 17f, 7f, 7f, 17f, 7f)
                curveTo(17f, 7f, 11f, 9f, 7f, 17f)
                close()
            }
        }.build()

        return _SeedPlus!!
    }

@Suppress("ObjectPropertyName")
private var _SeedPlus: ImageVector? = null
