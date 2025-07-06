package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.NotebookHeart: ImageVector
    get() {
        if (_NotebookHeart != null) {
            return _NotebookHeart!!
        }
        _NotebookHeart = ImageVector.Builder(
            name = "NotebookHeart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 23.3f)
                lineTo(18.4f, 22.8f)
                curveTo(16.4f, 20.9f, 15f, 19.7f, 15f, 18.2f)
                curveTo(15f, 17f, 16f, 16f, 17.2f, 16f)
                curveTo(17.9f, 16f, 18.6f, 16.3f, 19f, 16.8f)
                curveTo(19.4f, 16.3f, 20.1f, 16f, 20.8f, 16f)
                curveTo(22f, 16f, 23f, 16.9f, 23f, 18.2f)
                curveTo(23f, 19.7f, 21.6f, 20.9f, 19.6f, 22.8f)
                lineTo(19f, 23.3f)
                moveTo(3f, 7f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                verticalLineTo(4f)
                curveTo(5f, 2.89f, 5.9f, 2f, 7f, 2f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                lineTo(15.5f, 7.5f)
                lineTo(18f, 9f)
                verticalLineTo(2f)
                horizontalLineTo(19f)
                curveTo(20.05f, 2f, 21f, 2.95f, 21f, 4f)
                verticalLineTo(13.34f)
                curveTo(20.37f, 13.12f, 19.7f, 13f, 19f, 13f)
                curveTo(15.69f, 13f, 13f, 15.69f, 13f, 19f)
                curveTo(13f, 20.09f, 13.29f, 21.12f, 13.8f, 22f)
                horizontalLineTo(7f)
                curveTo(5.95f, 22f, 5f, 21.05f, 5f, 20f)
                verticalLineTo(19f)
                horizontalLineTo(3f)
                verticalLineTo(17f)
                horizontalLineTo(5f)
                verticalLineTo(13f)
                horizontalLineTo(3f)
                verticalLineTo(11f)
                horizontalLineTo(5f)
                verticalLineTo(7f)
                horizontalLineTo(3f)
                moveTo(5f, 5f)
                verticalLineTo(7f)
                horizontalLineTo(7f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                moveTo(5f, 19f)
                horizontalLineTo(7f)
                verticalLineTo(17f)
                horizontalLineTo(5f)
                verticalLineTo(19f)
                moveTo(5f, 13f)
                horizontalLineTo(7f)
                verticalLineTo(11f)
                horizontalLineTo(5f)
                verticalLineTo(13f)
                close()
            }
        }.build()

        return _NotebookHeart!!
    }

@Suppress("ObjectPropertyName")
private var _NotebookHeart: ImageVector? = null
