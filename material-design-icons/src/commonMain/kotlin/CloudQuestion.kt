package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CloudQuestion: ImageVector
    get() {
        if (_CloudQuestion != null) {
            return _CloudQuestion!!
        }
        _CloudQuestion = ImageVector.Builder(
            name = "CloudQuestion",
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
                moveTo(13f, 17f)
                horizontalLineTo(11f)
                verticalLineTo(15f)
                horizontalLineTo(13f)
                verticalLineTo(17f)
                moveTo(14.8f, 11.82f)
                curveTo(14.5f, 12.21f, 14.13f, 12.5f, 13.67f, 12.75f)
                curveTo(13.41f, 12.91f, 13.24f, 13.07f, 13.15f, 13.26f)
                curveTo(13.06f, 13.45f, 13f, 13.69f, 13f, 14f)
                horizontalLineTo(11f)
                curveTo(11f, 13.45f, 11.11f, 13.08f, 11.3f, 12.82f)
                curveTo(11.5f, 12.56f, 11.85f, 12.25f, 12.37f, 11.91f)
                curveTo(12.63f, 11.75f, 12.84f, 11.56f, 13f, 11.32f)
                curveTo(13.15f, 11.09f, 13.23f, 10.81f, 13.23f, 10.5f)
                curveTo(13.23f, 10.18f, 13.14f, 9.94f, 12.96f, 9.76f)
                curveTo(12.78f, 9.56f, 12.5f, 9.47f, 12.2f, 9.47f)
                curveTo(11.93f, 9.47f, 11.71f, 9.55f, 11.5f, 9.7f)
                curveTo(11.35f, 9.85f, 11.25f, 10.08f, 11.25f, 10.39f)
                horizontalLineTo(9.28f)
                curveTo(9.23f, 9.64f, 9.5f, 9f, 10.06f, 8.59f)
                curveTo(10.6f, 8.2f, 11.31f, 8f, 12.2f, 8f)
                curveTo(13.14f, 8f, 13.89f, 8.23f, 14.43f, 8.68f)
                reflectiveCurveTo(15.24f, 9.75f, 15.24f, 10.5f)
                curveTo(15.24f, 11f, 15.09f, 11.41f, 14.8f, 11.82f)
                close()
            }
        }.build()

        return _CloudQuestion!!
    }

@Suppress("ObjectPropertyName")
private var _CloudQuestion: ImageVector? = null
