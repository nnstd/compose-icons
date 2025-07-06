package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Fireplace: ImageVector
    get() {
        if (_Fireplace != null) {
            return _Fireplace!!
        }
        _Fireplace = ImageVector.Builder(
            name = "Fireplace",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 22f)
                horizontalLineTo(2f)
                verticalLineTo(20f)
                horizontalLineTo(22f)
                verticalLineTo(22f)
                moveTo(22f, 6f)
                horizontalLineTo(2f)
                verticalLineTo(3f)
                horizontalLineTo(22f)
                verticalLineTo(6f)
                moveTo(20f, 7f)
                verticalLineTo(19f)
                horizontalLineTo(17f)
                verticalLineTo(11f)
                curveTo(17f, 11f, 14.5f, 10f, 12f, 10f)
                curveTo(9.5f, 10f, 7f, 11f, 7f, 11f)
                verticalLineTo(19f)
                horizontalLineTo(4f)
                verticalLineTo(7f)
                horizontalLineTo(20f)
                moveTo(14.5f, 14.67f)
                horizontalLineTo(14.47f)
                lineTo(14.81f, 15.22f)
                lineTo(14.87f, 15.34f)
                curveTo(15.29f, 16.35f, 15f, 17.5f, 14.21f, 18.24f)
                curveTo(13.5f, 18.9f, 12.5f, 19.07f, 11.58f, 18.95f)
                curveTo(10.71f, 18.84f, 9.9f, 18.29f, 9.45f, 17.53f)
                curveTo(9.3f, 17.3f, 9.19f, 17.03f, 9.13f, 16.77f)
                lineTo(9f, 16.11f)
                curveTo(8.96f, 15.15f, 9.34f, 14.14f, 10.06f, 13.54f)
                curveTo(9.73f, 14.26f, 9.81f, 15.16f, 10.3f, 15.79f)
                lineTo(10.36f, 15.87f)
                curveTo(10.44f, 15.94f, 10.55f, 15.97f, 10.64f, 15.92f)
                curveTo(10.73f, 15.89f, 10.8f, 15.8f, 10.8f, 15.7f)
                lineTo(10.76f, 15.56f)
                curveTo(10.23f, 14.17f, 10.68f, 12.55f, 11.79f, 11.63f)
                curveTo(12.1f, 11.38f, 12.5f, 11.15f, 12.87f, 11.05f)
                curveTo(12.46f, 11.87f, 12.61f, 12.93f, 13.25f, 13.57f)
                lineTo(14.14f, 14.3f)
                lineTo(14.5f, 14.67f)
                moveTo(13.11f, 17.44f)
                verticalLineTo(17.44f)
                curveTo(13.37f, 17.2f, 13.53f, 16.8f, 13.5f, 16.44f)
                verticalLineTo(16.25f)
                curveTo(13.38f, 15.65f, 12.85f, 15.46f, 12.5f, 15f)
                lineTo(12.26f, 14.55f)
                curveTo(12.13f, 14.85f, 12.12f, 15.13f, 12.17f, 15.46f)
                curveTo(12.23f, 15.8f, 12.37f, 16.09f, 12.29f, 16.44f)
                curveTo(12.2f, 16.83f, 11.9f, 17.22f, 11.37f, 17.35f)
                curveTo(11.67f, 17.64f, 12.15f, 17.87f, 12.64f, 17.71f)
                lineTo(13.11f, 17.44f)
                close()
            }
        }.build()

        return _Fireplace!!
    }

@Suppress("ObjectPropertyName")
private var _Fireplace: ImageVector? = null
