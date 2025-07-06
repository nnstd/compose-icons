package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PowerSocketAu: ImageVector
    get() {
        if (_PowerSocketAu != null) {
            return _PowerSocketAu!!
        }
        _PowerSocketAu = ImageVector.Builder(
            name = "PowerSocketAu",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.22f, 2f)
                arcTo(2.22f, 2.22f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 4.22f)
                verticalLineTo(19.78f)
                curveTo(2f, 21f, 3f, 22f, 4.22f, 22f)
                horizontalLineTo(19.78f)
                arcTo(2.22f, 2.22f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 19.78f)
                verticalLineTo(4.22f)
                curveTo(22f, 3f, 21f, 2f, 19.78f, 2f)
                horizontalLineTo(4.22f)
                moveTo(12f, 4f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 20f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 4f)
                moveTo(8.27f, 7.54f)
                lineTo(6.27f, 11f)
                lineTo(8f, 12f)
                lineTo(10f, 8.54f)
                lineTo(8.27f, 7.54f)
                moveTo(15.73f, 7.54f)
                lineTo(14f, 8.54f)
                lineTo(16f, 12f)
                lineTo(17.73f, 11f)
                lineTo(15.73f, 7.54f)
                moveTo(11f, 14f)
                verticalLineTo(18f)
                horizontalLineTo(13f)
                verticalLineTo(14f)
                horizontalLineTo(11f)
                close()
            }
        }.build()

        return _PowerSocketAu!!
    }

@Suppress("ObjectPropertyName")
private var _PowerSocketAu: ImageVector? = null
