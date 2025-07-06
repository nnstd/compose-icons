package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AppleFinder: ImageVector
    get() {
        if (_AppleFinder != null) {
            return _AppleFinder!!
        }
        _AppleFinder = ImageVector.Builder(
            name = "AppleFinder",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 11f)
                curveTo(7.45f, 11f, 7f, 10.55f, 7f, 10f)
                verticalLineTo(8f)
                curveTo(7f, 7.45f, 7.45f, 7f, 8f, 7f)
                curveTo(8.55f, 7f, 9f, 7.45f, 9f, 8f)
                verticalLineTo(10f)
                curveTo(9f, 10.55f, 8.55f, 11f, 8f, 11f)
                moveTo(17f, 10f)
                verticalLineTo(8f)
                curveTo(17f, 7.45f, 16.55f, 7f, 16f, 7f)
                curveTo(15.45f, 7f, 15f, 7.45f, 15f, 8f)
                verticalLineTo(10f)
                curveTo(15f, 10.55f, 15.45f, 11f, 16f, 11f)
                curveTo(16.55f, 11f, 17f, 10.55f, 17f, 10f)
                moveTo(22f, 5f)
                verticalLineTo(20f)
                curveTo(22f, 21.1f, 21.1f, 22f, 20f, 22f)
                horizontalLineTo(4f)
                curveTo(2.9f, 22f, 2f, 21.1f, 2f, 20f)
                verticalLineTo(5f)
                curveTo(2f, 3.9f, 2.9f, 3f, 4f, 3f)
                horizontalLineTo(20f)
                curveTo(21.1f, 3f, 22f, 3.9f, 22f, 5f)
                moveTo(4f, 20f)
                lineTo(13.06f, 20f)
                curveTo(12.96f, 19.35f, 12.89f, 18.64f, 12.83f, 17.94f)
                curveTo(12.56f, 17.96f, 12.3f, 18f, 12f, 18f)
                curveTo(8.24f, 18f, 6.31f, 15.73f, 6.23f, 15.63f)
                curveTo(5.88f, 15.21f, 5.94f, 14.58f, 6.36f, 14.22f)
                curveTo(6.78f, 13.87f, 7.41f, 13.93f, 7.77f, 14.35f)
                curveTo(7.83f, 14.43f, 9.23f, 16f, 12f, 16f)
                curveTo(12.27f, 16f, 12.5f, 15.97f, 12.74f, 15.95f)
                curveTo(12.71f, 14.75f, 12.73f, 13.74f, 12.74f, 13.26f)
                horizontalLineTo(10.93f)
                curveTo(10.28f, 13.26f, 9.75f, 12.7f, 9.75f, 12f)
                curveTo(9.77f, 11.75f, 10.07f, 7.82f, 11f, 5f)
                horizontalLineTo(4f)
                lineTo(4f, 20f)
                moveTo(20f, 20f)
                lineTo(20f, 5f)
                horizontalLineTo(12.6f)
                curveTo(11.74f, 7.19f, 11.37f, 10.73f, 11.27f, 11.76f)
                horizontalLineTo(13.08f)
                curveTo(13.72f, 11.76f, 14.25f, 12.32f, 14.25f, 13f)
                curveTo(14.25f, 13.04f, 14.21f, 14.15f, 14.24f, 15.6f)
                curveTo(15.54f, 15.11f, 16.22f, 14.35f, 16.23f, 14.34f)
                curveTo(16.58f, 13.92f, 17.21f, 13.85f, 17.63f, 14.2f)
                curveTo(18.06f, 14.55f, 18.12f, 15.18f, 17.77f, 15.61f)
                curveTo(17.71f, 15.68f, 16.55f, 17.05f, 14.32f, 17.68f)
                curveTo(14.38f, 18.5f, 14.46f, 19.29f, 14.58f, 20f)
                horizontalLineTo(20f)
                close()
            }
        }.build()

        return _AppleFinder!!
    }

@Suppress("ObjectPropertyName")
private var _AppleFinder: ImageVector? = null
