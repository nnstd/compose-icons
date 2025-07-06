package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FireAlert: ImageVector
    get() {
        if (_FireAlert != null) {
            return _FireAlert!!
        }
        _FireAlert = ImageVector.Builder(
            name = "FireAlert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.66f, 11.2f)
                curveTo(15.43f, 10.9f, 15.15f, 10.64f, 14.89f, 10.38f)
                curveTo(14.22f, 9.78f, 13.46f, 9.35f, 12.82f, 8.72f)
                curveTo(11.33f, 7.26f, 11f, 4.85f, 11.95f, 3f)
                curveTo(11f, 3.23f, 10.17f, 3.75f, 9.46f, 4.32f)
                curveTo(6.87f, 6.4f, 5.85f, 10.07f, 7.07f, 13.22f)
                curveTo(7.11f, 13.32f, 7.15f, 13.42f, 7.15f, 13.55f)
                curveTo(7.15f, 13.77f, 7f, 13.97f, 6.8f, 14.05f)
                curveTo(6.57f, 14.15f, 6.33f, 14.09f, 6.14f, 13.93f)
                curveTo(6.08f, 13.88f, 6.04f, 13.83f, 6f, 13.76f)
                curveTo(4.87f, 12.33f, 4.69f, 10.28f, 5.45f, 8.64f)
                curveTo(3.78f, 10f, 2.87f, 12.3f, 3f, 14.47f)
                curveTo(3.06f, 14.97f, 3.12f, 15.47f, 3.29f, 15.97f)
                curveTo(3.43f, 16.57f, 3.7f, 17.17f, 4f, 17.7f)
                curveTo(5.08f, 19.43f, 6.95f, 20.67f, 8.96f, 20.92f)
                curveTo(11.1f, 21.19f, 13.39f, 20.8f, 15.03f, 19.32f)
                curveTo(16.86f, 17.66f, 17.5f, 15f, 16.56f, 12.72f)
                lineTo(16.43f, 12.46f)
                curveTo(16.22f, 12f, 15.66f, 11.2f, 15.66f, 11.2f)
                moveTo(12.5f, 17.5f)
                curveTo(12.22f, 17.74f, 11.76f, 18f, 11.4f, 18.1f)
                curveTo(10.28f, 18.5f, 9.16f, 17.94f, 8.5f, 17.28f)
                curveTo(9.69f, 17f, 10.4f, 16.12f, 10.61f, 15.23f)
                curveTo(10.78f, 14.43f, 10.46f, 13.77f, 10.33f, 13f)
                curveTo(10.21f, 12.26f, 10.23f, 11.63f, 10.5f, 10.94f)
                curveTo(10.69f, 11.32f, 10.89f, 11.7f, 11.13f, 12f)
                curveTo(11.9f, 13f, 13.11f, 13.44f, 13.37f, 14.8f)
                curveTo(13.41f, 14.94f, 13.43f, 15.08f, 13.43f, 15.23f)
                curveTo(13.46f, 16.05f, 13.1f, 16.95f, 12.5f, 17.5f)
                horizontalLineTo(12.5f)
                moveTo(21f, 13f)
                horizontalLineTo(19f)
                verticalLineTo(7f)
                horizontalLineTo(21f)
                verticalLineTo(13f)
                moveTo(21f, 17f)
                horizontalLineTo(19f)
                verticalLineTo(15f)
                horizontalLineTo(21f)
                verticalLineTo(17f)
                close()
            }
        }.build()

        return _FireAlert!!
    }

@Suppress("ObjectPropertyName")
private var _FireAlert: ImageVector? = null
