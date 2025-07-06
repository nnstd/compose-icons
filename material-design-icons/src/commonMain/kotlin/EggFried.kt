package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EggFried: ImageVector
    get() {
        if (_EggFried != null) {
            return _EggFried!!
        }
        _EggFried = ImageVector.Builder(
            name = "EggFried",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 4.5f)
                curveTo(14.17f, 4.5f, 14.58f, 5.07f, 15.5f, 6.32f)
                curveTo(15.88f, 6.85f, 16.32f, 7.44f, 16.94f, 8.06f)
                curveTo(17.43f, 8.55f, 17.86f, 8.93f, 18.21f, 9.24f)
                curveTo(19.3f, 10.19f, 19.5f, 10.36f, 19.5f, 12f)
                curveTo(19.5f, 14.93f, 19.5f, 15.38f, 17.94f, 16.94f)
                curveTo(16f, 18.86f, 15.38f, 19.5f, 13f, 19.5f)
                curveTo(11.88f, 19.5f, 11.5f, 19.18f, 10.89f, 18.69f)
                curveTo(10.27f, 18.19f, 9.43f, 17.5f, 8f, 17.5f)
                curveTo(4.96f, 17.5f, 4.5f, 14.05f, 4.5f, 12f)
                curveTo(4.5f, 10.65f, 5f, 8.91f, 6.47f, 8.42f)
                curveTo(8.25f, 7.83f, 9.2f, 6.71f, 9.96f, 5.81f)
                curveTo(10.75f, 4.88f, 11.11f, 4.5f, 12f, 4.5f)
                moveTo(12f, 3f)
                curveTo(9f, 3f, 9f, 6f, 6f, 7f)
                curveTo(3.88f, 7.71f, 3f, 10f, 3f, 12f)
                curveTo(3f, 15f, 4f, 19f, 8f, 19f)
                curveTo(10f, 19f, 10f, 21f, 13f, 21f)
                reflectiveCurveTo(17f, 20f, 19f, 18f)
                reflectiveCurveTo(21f, 15f, 21f, 12f)
                reflectiveCurveTo(20f, 9f, 18f, 7f)
                reflectiveCurveTo(16f, 3f, 12f, 3f)
                moveTo(12f, 8f)
                curveTo(9.79f, 8f, 8f, 9.79f, 8f, 12f)
                reflectiveCurveTo(9.79f, 16f, 12f, 16f)
                reflectiveCurveTo(16f, 14.21f, 16f, 12f)
                reflectiveCurveTo(14.21f, 8f, 12f, 8f)
                moveTo(12f, 10f)
                curveTo(10.9f, 10f, 10f, 10.9f, 10f, 12f)
                horizontalLineTo(9f)
                curveTo(9f, 10.35f, 10.35f, 9f, 12f, 9f)
                verticalLineTo(10f)
                close()
            }
        }.build()

        return _EggFried!!
    }

@Suppress("ObjectPropertyName")
private var _EggFried: ImageVector? = null
