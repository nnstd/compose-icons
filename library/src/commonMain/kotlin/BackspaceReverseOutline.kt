package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BackspaceReverseOutline: ImageVector
    get() {
        if (_BackspaceReverseOutline != null) {
            return _BackspaceReverseOutline!!
        }
        _BackspaceReverseOutline = ImageVector.Builder(
            name = "BackspaceReverseOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 15.59f)
                lineTo(6.41f, 17f)
                lineTo(10f, 13.41f)
                lineTo(13.59f, 17f)
                lineTo(15f, 15.59f)
                lineTo(11.41f, 12f)
                lineTo(15f, 8.41f)
                lineTo(13.59f, 7f)
                lineTo(10f, 10.59f)
                lineTo(6.41f, 7f)
                lineTo(5f, 8.41f)
                lineTo(8.59f, 12f)
                lineTo(5f, 15.59f)
                moveTo(2f, 3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 21f)
                horizontalLineTo(17f)
                curveTo(17.69f, 21f, 18.23f, 20.64f, 18.59f, 20.11f)
                lineTo(24f, 12f)
                lineTo(18.59f, 3.88f)
                curveTo(18.23f, 3.35f, 17.69f, 3f, 17f, 3f)
                horizontalLineTo(2f)
                moveTo(2f, 5f)
                horizontalLineTo(17f)
                lineTo(21.72f, 12f)
                lineTo(17f, 19f)
                horizontalLineTo(2f)
                verticalLineTo(5f)
                close()
            }
        }.build()

        return _BackspaceReverseOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BackspaceReverseOutline: ImageVector? = null
