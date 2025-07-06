package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.YoutubeSubscription: ImageVector
    get() {
        if (_YoutubeSubscription != null) {
            return _YoutubeSubscription!!
        }
        _YoutubeSubscription = ImageVector.Builder(
            name = "YoutubeSubscription",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 8f)
                horizontalLineTo(4f)
                verticalLineTo(6f)
                horizontalLineTo(20f)
                verticalLineTo(8f)
                moveTo(18f, 2f)
                horizontalLineTo(6f)
                verticalLineTo(4f)
                horizontalLineTo(18f)
                verticalLineTo(2f)
                moveTo(22f, 12f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 22f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 20f)
                verticalLineTo(12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 10f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 12f)
                moveTo(16f, 16f)
                lineTo(10f, 12.73f)
                verticalLineTo(19.26f)
                lineTo(16f, 16f)
                close()
            }
        }.build()

        return _YoutubeSubscription!!
    }

@Suppress("ObjectPropertyName")
private var _YoutubeSubscription: ImageVector? = null
