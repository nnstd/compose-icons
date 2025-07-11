package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Evernote: ImageVector
    get() {
        if (_Evernote != null) {
            return _Evernote!!
        }
        _Evernote = ImageVector.Builder(
            name = "Evernote",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.09f, 11.63f)
                curveTo(15.09f, 11.63f, 15.28f, 10.35f, 16f, 10.35f)
                curveTo(16.76f, 10.35f, 17.78f, 12.06f, 17.78f, 12.06f)
                curveTo(17.78f, 12.06f, 15.46f, 11.63f, 15.09f, 11.63f)
                moveTo(19f, 4.69f)
                curveTo(18.64f, 4.09f, 16.83f, 3.41f, 15.89f, 3.41f)
                curveTo(14.96f, 3.41f, 13.5f, 3.41f, 13.5f, 3.41f)
                curveTo(13.5f, 3.41f, 12.7f, 2f, 10.88f, 2f)
                curveTo(9.05f, 2f, 9.17f, 2.81f, 9.17f, 3.5f)
                verticalLineTo(6.32f)
                lineTo(8.34f, 7.19f)
                horizontalLineTo(4.5f)
                curveTo(4.5f, 7.19f, 3.44f, 7.91f, 3.44f, 9.44f)
                curveTo(3.44f, 11f, 3.92f, 16.35f, 7.13f, 16.85f)
                curveTo(10.93f, 17.43f, 11.58f, 15.67f, 11.58f, 15.46f)
                curveTo(11.58f, 14.56f, 11.6f, 13.21f, 11.6f, 13.21f)
                curveTo(11.6f, 13.21f, 12.71f, 15.33f, 14.39f, 15.33f)
                curveTo(16.07f, 15.33f, 17.04f, 16.3f, 17.04f, 17.29f)
                curveTo(17.04f, 18.28f, 17.04f, 19.13f, 17.04f, 19.13f)
                curveTo(17.04f, 19.13f, 17f, 20.28f, 16f, 20.28f)
                curveTo(15f, 20.28f, 13.89f, 20.28f, 13.89f, 20.28f)
                curveTo(13.89f, 20.28f, 13.2f, 19.74f, 13.2f, 19f)
                curveTo(13.2f, 18.25f, 13.53f, 18.05f, 13.93f, 18.05f)
                curveTo(14.32f, 18.05f, 14.65f, 18.09f, 14.65f, 18.09f)
                verticalLineTo(16.53f)
                curveTo(14.65f, 16.53f, 11.47f, 16.5f, 11.47f, 18.94f)
                curveTo(11.47f, 21.37f, 13.13f, 22f, 14.46f, 22f)
                curveTo(15.8f, 22f, 16.63f, 22f, 16.63f, 22f)
                curveTo(16.63f, 22f, 20.56f, 21.5f, 20.56f, 13.75f)
                curveTo(20.56f, 6f, 19.33f, 5.28f, 19f, 4.69f)
                moveTo(7.5f, 6.31f)
                horizontalLineTo(4.26f)
                lineTo(8.32f, 2.22f)
                verticalLineTo(5.5f)
                lineTo(7.5f, 6.31f)
                close()
            }
        }.build()

        return _Evernote!!
    }

@Suppress("ObjectPropertyName")
private var _Evernote: ImageVector? = null
