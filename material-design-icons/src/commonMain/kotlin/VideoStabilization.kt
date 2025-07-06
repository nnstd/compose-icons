package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.VideoStabilization: ImageVector
    get() {
        if (_VideoStabilization != null) {
            return _VideoStabilization!!
        }
        _VideoStabilization = ImageVector.Builder(
            name = "VideoStabilization",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 4f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 6f)
                verticalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 20f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 18f)
                verticalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 4f)
                moveTo(4f, 6f)
                verticalLineTo(18f)
                horizontalLineTo(20f)
                verticalLineTo(6f)
                horizontalLineTo(4f)
                moveTo(7.24f, 6.58f)
                lineTo(18.83f, 9.69f)
                lineTo(16.76f, 17.42f)
                lineTo(5.17f, 14.31f)
                lineTo(7.24f, 6.58f)
                close()
            }
        }.build()

        return _VideoStabilization!!
    }

@Suppress("ObjectPropertyName")
private var _VideoStabilization: ImageVector? = null
