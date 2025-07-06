package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.VideoAccount: ImageVector
    get() {
        if (_VideoAccount != null) {
            return _VideoAccount!!
        }
        _VideoAccount = ImageVector.Builder(
            name = "VideoAccount",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 10.5f)
                lineTo(21f, 6.5f)
                verticalLineTo(17.5f)
                lineTo(17f, 13.5f)
                verticalLineTo(17f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 18f)
                horizontalLineTo(4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 17f)
                verticalLineTo(7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 6f)
                horizontalLineTo(16f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 7f)
                verticalLineTo(10.5f)
                moveTo(14f, 16f)
                verticalLineTo(15f)
                curveTo(14f, 13.67f, 11.33f, 13f, 10f, 13f)
                curveTo(8.67f, 13f, 6f, 13.67f, 6f, 15f)
                verticalLineTo(16f)
                horizontalLineTo(14f)
                moveTo(10f, 8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 10f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 10f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 8f)
                close()
            }
        }.build()

        return _VideoAccount!!
    }

@Suppress("ObjectPropertyName")
private var _VideoAccount: ImageVector? = null
