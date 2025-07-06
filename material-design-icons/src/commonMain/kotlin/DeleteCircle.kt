package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DeleteCircle: ImageVector
    get() {
        if (_DeleteCircle != null) {
            return _DeleteCircle!!
        }
        _DeleteCircle = ImageVector.Builder(
            name = "DeleteCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                curveTo(17.53f, 2f, 22f, 6.47f, 22f, 12f)
                curveTo(22f, 17.53f, 17.53f, 22f, 12f, 22f)
                curveTo(6.47f, 22f, 2f, 17.53f, 2f, 12f)
                curveTo(2f, 6.47f, 6.47f, 2f, 12f, 2f)
                moveTo(17f, 7f)
                horizontalLineTo(14.5f)
                lineTo(13.5f, 6f)
                horizontalLineTo(10.5f)
                lineTo(9.5f, 7f)
                horizontalLineTo(7f)
                verticalLineTo(9f)
                horizontalLineTo(17f)
                verticalLineTo(7f)
                moveTo(9f, 18f)
                horizontalLineTo(15f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 17f)
                verticalLineTo(10f)
                horizontalLineTo(8f)
                verticalLineTo(17f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 18f)
                close()
            }
        }.build()

        return _DeleteCircle!!
    }

@Suppress("ObjectPropertyName")
private var _DeleteCircle: ImageVector? = null
