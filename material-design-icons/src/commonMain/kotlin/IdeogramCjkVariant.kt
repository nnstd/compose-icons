package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.IdeogramCjkVariant: ImageVector
    get() {
        if (_IdeogramCjkVariant != null) {
            return _IdeogramCjkVariant!!
        }
        _IdeogramCjkVariant = ImageVector.Builder(
            name = "IdeogramCjkVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 4f)
                verticalLineTo(6f)
                horizontalLineTo(4f)
                verticalLineTo(8f)
                horizontalLineTo(15.36f)
                curveTo(15.13f, 8.87f, 14.63f, 9.77f, 13.88f, 10.69f)
                curveTo(13.35f, 11.35f, 12.71f, 12f, 12f, 12.67f)
                curveTo(11.29f, 12f, 10.65f, 11.35f, 10.12f, 10.69f)
                curveTo(9.65f, 10.12f, 9.3f, 9.55f, 9.03f, 9f)
                horizontalLineTo(6.85f)
                curveTo(7.21f, 10.05f, 7.82f, 11.03f, 8.56f, 11.95f)
                curveTo(9.13f, 12.66f, 9.79f, 13.34f, 10.5f, 14f)
                lineTo(5.36f, 18.23f)
                lineTo(6.64f, 19.77f)
                lineTo(12f, 15.34f)
                lineTo(17.36f, 19.77f)
                lineTo(18.64f, 18.23f)
                lineTo(13.5f, 14f)
                curveTo(14.21f, 13.34f, 14.87f, 12.66f, 15.44f, 11.95f)
                curveTo(16.41f, 10.74f, 17.16f, 9.43f, 17.4f, 8f)
                horizontalLineTo(20f)
                verticalLineTo(6f)
                horizontalLineTo(13f)
                verticalLineTo(4f)
                close()
            }
        }.build()

        return _IdeogramCjkVariant!!
    }

@Suppress("ObjectPropertyName")
private var _IdeogramCjkVariant: ImageVector? = null
