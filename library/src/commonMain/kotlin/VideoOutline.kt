package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.VideoOutline: ImageVector
    get() {
        if (_VideoOutline != null) {
            return _VideoOutline!!
        }
        _VideoOutline = ImageVector.Builder(
            name = "VideoOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 8f)
                verticalLineTo(16f)
                horizontalLineTo(5f)
                verticalLineTo(8f)
                horizontalLineTo(15f)
                moveTo(16f, 6f)
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
                verticalLineTo(7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 6f)
                close()
            }
        }.build()

        return _VideoOutline!!
    }

@Suppress("ObjectPropertyName")
private var _VideoOutline: ImageVector? = null
