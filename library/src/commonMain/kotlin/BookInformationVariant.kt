package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BookInformationVariant: ImageVector
    get() {
        if (_BookInformationVariant != null) {
            return _BookInformationVariant!!
        }
        _BookInformationVariant = ImageVector.Builder(
            name = "BookInformationVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 2f)
                horizontalLineTo(12f)
                verticalLineTo(9f)
                lineTo(9.5f, 7.5f)
                lineTo(7f, 9f)
                verticalLineTo(2f)
                horizontalLineTo(6f)
                curveTo(4.9f, 2f, 4f, 2.9f, 4f, 4f)
                verticalLineTo(20f)
                curveTo(4f, 21.1f, 4.9f, 22f, 6f, 22f)
                horizontalLineTo(18f)
                curveTo(19.1f, 22f, 20f, 21.1f, 20f, 20f)
                verticalLineTo(4f)
                curveTo(20f, 2.89f, 19.1f, 2f, 18f, 2f)
                moveTo(17.68f, 18.41f)
                curveTo(17.57f, 18.5f, 16.47f, 19.25f, 16.05f, 19.5f)
                curveTo(15.63f, 19.79f, 14f, 20.72f, 14.26f, 18.92f)
                curveTo(14.89f, 15.28f, 16.11f, 13.12f, 14.65f, 14.06f)
                curveTo(14.27f, 14.29f, 14.05f, 14.43f, 13.91f, 14.5f)
                curveTo(13.78f, 14.61f, 13.79f, 14.6f, 13.68f, 14.41f)
                reflectiveCurveTo(13.53f, 14.23f, 13.67f, 14.13f)
                curveTo(13.67f, 14.13f, 15.9f, 12.34f, 16.72f, 12.28f)
                curveTo(17.5f, 12.21f, 17.31f, 13.17f, 17.24f, 13.61f)
                curveTo(16.78f, 15.46f, 15.94f, 18.15f, 16.07f, 18.54f)
                curveTo(16.18f, 18.93f, 17f, 18.31f, 17.44f, 18f)
                curveTo(17.44f, 18f, 17.5f, 17.93f, 17.61f, 18.05f)
                curveTo(17.72f, 18.22f, 17.83f, 18.3f, 17.68f, 18.41f)
                moveTo(16.97f, 11.06f)
                curveTo(16.4f, 11.06f, 15.94f, 10.6f, 15.94f, 10.03f)
                curveTo(15.94f, 9.46f, 16.4f, 9f, 16.97f, 9f)
                curveTo(17.54f, 9f, 18f, 9.46f, 18f, 10.03f)
                curveTo(18f, 10.6f, 17.54f, 11.06f, 16.97f, 11.06f)
                close()
            }
        }.build()

        return _BookInformationVariant!!
    }

@Suppress("ObjectPropertyName")
private var _BookInformationVariant: ImageVector? = null
