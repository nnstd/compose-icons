package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TableOfContents: ImageVector
    get() {
        if (_TableOfContents != null) {
            return _TableOfContents!!
        }
        _TableOfContents = ImageVector.Builder(
            name = "TableOfContents",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 9f)
                horizontalLineTo(17f)
                verticalLineTo(7f)
                horizontalLineTo(3f)
                verticalLineTo(9f)
                moveTo(3f, 13f)
                horizontalLineTo(17f)
                verticalLineTo(11f)
                horizontalLineTo(3f)
                verticalLineTo(13f)
                moveTo(3f, 17f)
                horizontalLineTo(17f)
                verticalLineTo(15f)
                horizontalLineTo(3f)
                verticalLineTo(17f)
                moveTo(19f, 17f)
                horizontalLineTo(21f)
                verticalLineTo(15f)
                horizontalLineTo(19f)
                verticalLineTo(17f)
                moveTo(19f, 7f)
                verticalLineTo(9f)
                horizontalLineTo(21f)
                verticalLineTo(7f)
                horizontalLineTo(19f)
                moveTo(19f, 13f)
                horizontalLineTo(21f)
                verticalLineTo(11f)
                horizontalLineTo(19f)
                verticalLineTo(13f)
                close()
            }
        }.build()

        return _TableOfContents!!
    }

@Suppress("ObjectPropertyName")
private var _TableOfContents: ImageVector? = null
