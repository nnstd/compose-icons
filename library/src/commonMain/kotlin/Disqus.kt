package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Disqus: ImageVector
    get() {
        if (_Disqus != null) {
            return _Disqus!!
        }
        _Disqus = ImageVector.Builder(
            name = "Disqus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.08f, 22f)
                curveTo(9.63f, 22f, 7.39f, 21.11f, 5.66f, 19.63f)
                lineTo(1.41f, 20.21f)
                lineTo(3.05f, 16.15f)
                curveTo(2.5f, 14.88f, 2.16f, 13.5f, 2.16f, 12f)
                curveTo(2.16f, 6.5f, 6.6f, 2f, 12.08f, 2f)
                curveTo(17.56f, 2f, 22f, 6.5f, 22f, 12f)
                curveTo(22f, 17.5f, 17.56f, 22f, 12.08f, 22f)
                moveTo(17.5f, 11.97f)
                verticalLineTo(11.94f)
                curveTo(17.5f, 9.06f, 15.46f, 7f, 11.95f, 7f)
                horizontalLineTo(8.16f)
                verticalLineTo(17f)
                horizontalLineTo(11.9f)
                curveTo(15.43f, 17f, 17.5f, 14.86f, 17.5f, 11.97f)
                moveTo(12f, 14.54f)
                horizontalLineTo(10.89f)
                verticalLineTo(9.46f)
                horizontalLineTo(12f)
                curveTo(13.62f, 9.46f, 14.7f, 10.39f, 14.7f, 12f)
                verticalLineTo(12f)
                curveTo(14.7f, 13.63f, 13.62f, 14.54f, 12f, 14.54f)
                close()
            }
        }.build()

        return _Disqus!!
    }

@Suppress("ObjectPropertyName")
private var _Disqus: ImageVector? = null
