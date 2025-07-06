package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CloudRefresh: ImageVector
    get() {
        if (_CloudRefresh != null) {
            return _CloudRefresh!!
        }
        _CloudRefresh = ImageVector.Builder(
            name = "CloudRefresh",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 18.5f)
                curveTo(12f, 19f, 12.07f, 19.5f, 12.18f, 20f)
                horizontalLineTo(6.5f)
                curveTo(5f, 20f, 3.69f, 19.5f, 2.61f, 18.43f)
                curveTo(1.54f, 17.38f, 1f, 16.09f, 1f, 14.58f)
                curveTo(1f, 13.28f, 1.39f, 12.12f, 2.17f, 11.1f)
                reflectiveCurveTo(4f, 9.43f, 5.25f, 9.15f)
                curveTo(5.67f, 7.62f, 6.5f, 6.38f, 7.75f, 5.43f)
                reflectiveCurveTo(10.42f, 4f, 12f, 4f)
                curveTo(13.95f, 4f, 15.6f, 4.68f, 16.96f, 6.04f)
                curveTo(18.32f, 7.4f, 19f, 9.05f, 19f, 11f)
                curveTo(20.15f, 11.13f, 21.1f, 11.63f, 21.86f, 12.5f)
                curveTo(22.1f, 12.76f, 22.29f, 13.05f, 22.46f, 13.36f)
                curveTo(21.36f, 12.5f, 20f, 12f, 18.5f, 12f)
                curveTo(14.91f, 12f, 12f, 14.91f, 12f, 18.5f)
                moveTo(18f, 14.5f)
                curveTo(15.79f, 14.5f, 14f, 16.29f, 14f, 18.5f)
                reflectiveCurveTo(15.79f, 22.5f, 18f, 22.5f)
                curveTo(19.68f, 22.5f, 21.12f, 21.47f, 21.71f, 20f)
                horizontalLineTo(20f)
                curveTo(19.54f, 20.61f, 18.82f, 21f, 18f, 21f)
                curveTo(16.62f, 21f, 15.5f, 19.88f, 15.5f, 18.5f)
                reflectiveCurveTo(16.62f, 16f, 18f, 16f)
                curveTo(18.69f, 16f, 19.32f, 16.28f, 19.77f, 16.73f)
                lineTo(18f, 18.5f)
                horizontalLineTo(22f)
                verticalLineTo(14.5f)
                lineTo(20.83f, 15.67f)
                curveTo(20.11f, 14.95f, 19.11f, 14.5f, 18f, 14.5f)
                close()
            }
        }.build()

        return _CloudRefresh!!
    }

@Suppress("ObjectPropertyName")
private var _CloudRefresh: ImageVector? = null
