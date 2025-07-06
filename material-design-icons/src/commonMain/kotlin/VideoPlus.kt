package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.VideoPlus: ImageVector
    get() {
        if (_VideoPlus != null) {
            return _VideoPlus!!
        }
        _VideoPlus = ImageVector.Builder(
            name = "VideoPlus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 10.5f)
                verticalLineTo(7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 6f)
                horizontalLineTo(4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 7f)
                verticalLineTo(17f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 18f)
                horizontalLineTo(16f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 17f)
                verticalLineTo(13.5f)
                lineTo(21f, 17.5f)
                verticalLineTo(6.5f)
                lineTo(17f, 10.5f)
                moveTo(14f, 13f)
                horizontalLineTo(11f)
                verticalLineTo(16f)
                horizontalLineTo(9f)
                verticalLineTo(13f)
                horizontalLineTo(6f)
                verticalLineTo(11f)
                horizontalLineTo(9f)
                verticalLineTo(8f)
                horizontalLineTo(11f)
                verticalLineTo(11f)
                horizontalLineTo(14f)
                verticalLineTo(13f)
                close()
            }
        }.build()

        return _VideoPlus!!
    }

@Suppress("ObjectPropertyName")
private var _VideoPlus: ImageVector? = null
