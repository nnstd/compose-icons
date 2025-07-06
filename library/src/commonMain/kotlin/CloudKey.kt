package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CloudKey: ImageVector
    get() {
        if (_CloudKey != null) {
            return _CloudKey!!
        }
        _CloudKey = ImageVector.Builder(
            name = "CloudKey",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.41f, 20f)
                horizontalLineTo(6.5f)
                curveTo(5f, 20f, 3.68f, 19.5f, 2.61f, 18.43f)
                curveTo(1.54f, 17.38f, 1f, 16.09f, 1f, 14.58f)
                curveTo(1f, 13.28f, 1.39f, 12.12f, 2.17f, 11.1f)
                curveTo(2.96f, 10.08f, 4f, 9.43f, 5.25f, 9.15f)
                curveTo(5.67f, 7.62f, 6.5f, 6.38f, 7.75f, 5.43f)
                curveTo(9f, 4.5f, 10.42f, 4f, 12f, 4f)
                curveTo(13.95f, 4f, 15.61f, 4.68f, 16.96f, 6.04f)
                curveTo(18.32f, 7.39f, 19f, 9.05f, 19f, 11f)
                curveTo(20.15f, 11.13f, 21.11f, 11.63f, 21.86f, 12.5f)
                curveTo(22.5f, 13.23f, 22.86f, 14.06f, 22.96f, 15f)
                horizontalLineTo(18f)
                curveTo(17.07f, 13.77f, 15.61f, 13f, 14f, 13f)
                curveTo(11.2f, 13f, 9f, 15.2f, 9f, 18f)
                curveTo(9f, 18.72f, 9.15f, 19.39f, 9.41f, 20f)
                moveTo(23f, 17f)
                verticalLineTo(19f)
                horizontalLineTo(21f)
                verticalLineTo(21f)
                horizontalLineTo(19f)
                verticalLineTo(19f)
                horizontalLineTo(16.8f)
                curveTo(16.4f, 20.2f, 15.3f, 21f, 14f, 21f)
                curveTo(12.3f, 21f, 11f, 19.7f, 11f, 18f)
                reflectiveCurveTo(12.3f, 15f, 14f, 15f)
                curveTo(15.3f, 15f, 16.4f, 15.8f, 16.8f, 17f)
                horizontalLineTo(23f)
                moveTo(15f, 18f)
                curveTo(15f, 17.5f, 14.6f, 17f, 14f, 17f)
                reflectiveCurveTo(13f, 17.5f, 13f, 18f)
                reflectiveCurveTo(13.4f, 19f, 14f, 19f)
                reflectiveCurveTo(15f, 18.5f, 15f, 18f)
                close()
            }
        }.build()

        return _CloudKey!!
    }

@Suppress("ObjectPropertyName")
private var _CloudKey: ImageVector? = null
