package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BackspaceReverse: ImageVector
    get() {
        if (_BackspaceReverse != null) {
            return _BackspaceReverse!!
        }
        _BackspaceReverse = ImageVector.Builder(
            name = "BackspaceReverse",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 21f)
                horizontalLineTo(17f)
                curveTo(17.7f, 21f, 18.2f, 20.6f, 18.6f, 20.1f)
                lineTo(24f, 12f)
                lineTo(18.6f, 3.9f)
                curveTo(18.2f, 3.4f, 17.7f, 3f, 17f, 3f)
                horizontalLineTo(2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 21f)
                moveTo(5f, 8.4f)
                lineTo(6.4f, 7f)
                lineTo(10f, 10.6f)
                lineTo(13.6f, 7f)
                lineTo(15f, 8.4f)
                lineTo(11.4f, 12f)
                lineTo(15f, 15.6f)
                lineTo(13.6f, 17f)
                lineTo(10f, 13.4f)
                lineTo(6.4f, 17f)
                lineTo(5f, 15.6f)
                lineTo(8.6f, 12f)
            }
        }.build()

        return _BackspaceReverse!!
    }

@Suppress("ObjectPropertyName")
private var _BackspaceReverse: ImageVector? = null
