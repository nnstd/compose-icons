package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PictureInPictureTopRightOutline: ImageVector
    get() {
        if (_PictureInPictureTopRightOutline != null) {
            return _PictureInPictureTopRightOutline!!
        }
        _PictureInPictureTopRightOutline = ImageVector.Builder(
            name = "PictureInPictureTopRightOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 7f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                horizontalLineTo(19f)
                verticalLineTo(7f)
                moveTo(17f, 11f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(17f)
                verticalLineTo(11f)
                moveTo(21f, 3f)
                horizontalLineTo(3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 5f)
                verticalLineTo(19f)
                curveTo(1f, 20.11f, 1.9f, 21f, 3f, 21f)
                horizontalLineTo(21f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 19f)
                verticalLineTo(5f)
                curveTo(23f, 3.91f, 22.1f, 3f, 21f, 3f)
                moveTo(21f, 19f)
                horizontalLineTo(3f)
                verticalLineTo(5f)
                horizontalLineTo(21f)
                verticalLineTo(19f)
                close()
            }
        }.build()

        return _PictureInPictureTopRightOutline!!
    }

@Suppress("ObjectPropertyName")
private var _PictureInPictureTopRightOutline: ImageVector? = null
