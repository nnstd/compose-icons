package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.OrbitVariant: ImageVector
    get() {
        if (_OrbitVariant != null) {
            return _OrbitVariant!!
        }
        _OrbitVariant = ImageVector.Builder(
            name = "OrbitVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 8f)
                lineTo(15f, 12f)
                horizontalLineTo(18f)
                curveTo(18f, 15.31f, 15.31f, 18f, 12f, 18f)
                curveTo(11f, 18f, 10.03f, 17.75f, 9.2f, 17.3f)
                lineTo(7.74f, 18.76f)
                curveTo(8.97f, 19.54f, 10.43f, 20f, 12f, 20f)
                curveTo(16.42f, 20f, 20f, 16.42f, 20f, 12f)
                horizontalLineTo(23f)
                moveTo(6f, 12f)
                curveTo(6f, 8.69f, 8.69f, 6f, 12f, 6f)
                curveTo(13f, 6f, 13.97f, 6.25f, 14.8f, 6.7f)
                lineTo(16.26f, 5.24f)
                curveTo(15.03f, 4.46f, 13.57f, 4f, 12f, 4f)
                curveTo(7.58f, 4f, 4f, 7.58f, 4f, 12f)
                horizontalLineTo(1f)
                lineTo(5f, 16f)
                lineTo(9f, 12f)
                moveTo(14f, 12f)
                curveTo(14f, 13.11f, 13.11f, 14f, 12f, 14f)
                reflectiveCurveTo(10f, 13.11f, 10f, 12f)
                reflectiveCurveTo(10.9f, 10f, 12f, 10f)
                reflectiveCurveTo(14f, 10.9f, 14f, 12f)
                close()
            }
        }.build()

        return _OrbitVariant!!
    }

@Suppress("ObjectPropertyName")
private var _OrbitVariant: ImageVector? = null
