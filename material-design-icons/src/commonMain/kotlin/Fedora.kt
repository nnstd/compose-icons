package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Fedora: ImageVector
    get() {
        if (_Fedora != null) {
            return _Fedora!!
        }
        _Fedora = ImageVector.Builder(
            name = "Fedora",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                curveTo(6.5f, 2f, 2f, 6.47f, 2f, 12f)
                horizontalLineTo(2f)
                verticalLineTo(19.73f)
                horizontalLineTo(2f)
                curveTo(2f, 21f, 3f, 22f, 4.27f, 22f)
                horizontalLineTo(12f)
                curveTo(17.53f, 22f, 22f, 17.5f, 22f, 12f)
                curveTo(22f, 6.5f, 17.5f, 2f, 12f, 2f)
                moveTo(14.03f, 6.12f)
                curveTo(15.71f, 6.12f, 17.29f, 7.4f, 17.29f, 9.18f)
                curveTo(17.29f, 9.34f, 17.29f, 9.5f, 17.27f, 9.69f)
                curveTo(17.22f, 10.16f, 16.79f, 10.5f, 16.32f, 10.44f)
                curveTo(15.85f, 10.37f, 15.53f, 9.92f, 15.62f, 9.46f)
                curveTo(15.62f, 9.4f, 15.63f, 9.32f, 15.63f, 9.18f)
                curveTo(15.63f, 8.17f, 14.81f, 7.78f, 14.03f, 7.78f)
                curveTo(13.25f, 7.78f, 12.55f, 8.44f, 12.55f, 9.18f)
                curveTo(12.56f, 10.03f, 12.55f, 10.88f, 12.55f, 11.74f)
                lineTo(14f, 11.72f)
                curveTo(15.12f, 11.7f, 15.13f, 13.4f, 14f, 13.39f)
                lineTo(12.55f, 13.4f)
                lineTo(12.54f, 15.79f)
                curveTo(12.36f, 17.67f, 10.77f, 19.16f, 8.85f, 19.16f)
                curveTo(6.82f, 19.16f, 5.14f, 17.5f, 5.14f, 15.46f)
                curveTo(5.2f, 13.37f, 6.88f, 11.72f, 9f, 11.74f)
                lineTo(10.15f, 11.73f)
                verticalLineTo(13.4f)
                lineTo(9f, 13.41f)
                horizontalLineTo(8.97f)
                curveTo(7.81f, 13.44f, 6.82f, 14.23f, 6.81f, 15.47f)
                curveTo(6.81f, 16.59f, 7.72f, 17.5f, 8.85f, 17.5f)
                curveTo(10f, 17.5f, 10.88f, 16.67f, 10.88f, 15.47f)
                curveTo(10.9f, 13.46f, 10.87f, 11.25f, 10.88f, 9.17f)
                curveTo(10.88f, 9.05f, 10.89f, 8.96f, 10.9f, 8.83f)
                curveTo(11.09f, 7.29f, 12.47f, 6.12f, 14.03f, 6.12f)
            }
        }.build()

        return _Fedora!!
    }

@Suppress("ObjectPropertyName")
private var _Fedora: ImageVector? = null
