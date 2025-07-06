package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Goodreads: ImageVector
    get() {
        if (_Goodreads != null) {
            return _Goodreads!!
        }
        _Goodreads = ImageVector.Builder(
            name = "Goodreads",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 12.77f)
                curveTo(15.96f, 14.42f, 14.22f, 15.5f, 12.25f, 15.5f)
                curveTo(9.07f, 15.5f, 6.5f, 12.7f, 6.5f, 9.25f)
                curveTo(6.5f, 5.8f, 9.07f, 3f, 12.25f, 3f)
                curveTo(14.22f, 3f, 15.96f, 4.08f, 17f, 5.73f)
                verticalLineTo(3f)
                horizontalLineTo(18f)
                verticalLineTo(15.25f)
                curveTo(18f, 20.71f, 14.54f, 21f, 11.5f, 21f)
                curveTo(9f, 21f, 7.55f, 19.31f, 7.13f, 17f)
                horizontalLineTo(8.14f)
                curveTo(8.5f, 18.75f, 9.54f, 20f, 11.5f, 20f)
                curveTo(13.72f, 20f, 17f, 20.05f, 17f, 15.25f)
                verticalLineTo(15.25f)
                lineTo(17f, 12.77f)
                moveTo(12.25f, 4f)
                curveTo(9.63f, 4f, 7.5f, 6.35f, 7.5f, 9.25f)
                curveTo(7.5f, 12.15f, 9.63f, 14.5f, 12.25f, 14.5f)
                curveTo(14.87f, 14.5f, 17f, 12.15f, 17f, 9.25f)
                curveTo(17f, 6.35f, 14.87f, 4f, 12.25f, 4f)
                close()
            }
        }.build()

        return _Goodreads!!
    }

@Suppress("ObjectPropertyName")
private var _Goodreads: ImageVector? = null
