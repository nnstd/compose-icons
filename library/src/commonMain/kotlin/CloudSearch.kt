package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CloudSearch: ImageVector
    get() {
        if (_CloudSearch != null) {
            return _CloudSearch!!
        }
        _CloudSearch = ImageVector.Builder(
            name = "CloudSearch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.86f, 12.5f)
                curveTo(21.1f, 11.63f, 20.15f, 11.13f, 19f, 11f)
                curveTo(19f, 9.05f, 18.32f, 7.4f, 16.96f, 6.04f)
                curveTo(15.6f, 4.68f, 13.95f, 4f, 12f, 4f)
                curveTo(10.42f, 4f, 9f, 4.47f, 7.75f, 5.43f)
                reflectiveCurveTo(5.67f, 7.62f, 5.25f, 9.15f)
                curveTo(4f, 9.43f, 2.96f, 10.08f, 2.17f, 11.1f)
                reflectiveCurveTo(1f, 13.28f, 1f, 14.58f)
                curveTo(1f, 16.09f, 1.54f, 17.38f, 2.61f, 18.43f)
                curveTo(3.69f, 19.5f, 5f, 20f, 6.5f, 20f)
                horizontalLineTo(18.5f)
                curveTo(19.75f, 20f, 20.81f, 19.56f, 21.69f, 18.69f)
                curveTo(22.56f, 17.81f, 23f, 16.75f, 23f, 15.5f)
                curveTo(23f, 14.35f, 22.62f, 13.35f, 21.86f, 12.5f)
                moveTo(16.57f, 18f)
                lineTo(14f, 15.43f)
                curveTo(13.43f, 15.79f, 12.74f, 16f, 12f, 16f)
                curveTo(9.79f, 16f, 8f, 14.21f, 8f, 12f)
                reflectiveCurveTo(9.79f, 8f, 12f, 8f)
                reflectiveCurveTo(16f, 9.79f, 16f, 12f)
                curveTo(16f, 12.74f, 15.79f, 13.43f, 15.43f, 14f)
                lineTo(18f, 16.57f)
                lineTo(16.57f, 18f)
                moveTo(14f, 12f)
                curveTo(14f, 13.11f, 13.11f, 14f, 12f, 14f)
                reflectiveCurveTo(10f, 13.11f, 10f, 12f)
                reflectiveCurveTo(10.9f, 10f, 12f, 10f)
                reflectiveCurveTo(14f, 10.9f, 14f, 12f)
                close()
            }
        }.build()

        return _CloudSearch!!
    }

@Suppress("ObjectPropertyName")
private var _CloudSearch: ImageVector? = null
