package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AppleSafari: ImageVector
    get() {
        if (_AppleSafari != null) {
            return _AppleSafari!!
        }
        _AppleSafari = ImageVector.Builder(
            name = "AppleSafari",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                moveTo(12f, 4f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 12f)
                curveTo(4f, 14.09f, 4.8f, 16f, 6.11f, 17.41f)
                lineTo(9.88f, 9.88f)
                lineTo(17.41f, 6.11f)
                curveTo(16f, 4.8f, 14.09f, 4f, 12f, 4f)
                moveTo(12f, 20f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 12f)
                curveTo(20f, 9.91f, 19.2f, 8f, 17.89f, 6.59f)
                lineTo(14.12f, 14.12f)
                lineTo(6.59f, 17.89f)
                curveTo(8f, 19.2f, 9.91f, 20f, 12f, 20f)
                moveTo(12f, 12f)
                lineTo(11.23f, 11.23f)
                lineTo(9.7f, 14.3f)
                lineTo(12.77f, 12.77f)
                lineTo(12f, 12f)
                moveTo(12f, 17.5f)
                horizontalLineTo(13f)
                verticalLineTo(19f)
                horizontalLineTo(12f)
                verticalLineTo(17.5f)
                moveTo(15.88f, 15.89f)
                lineTo(16.59f, 15.18f)
                lineTo(17.65f, 16.24f)
                lineTo(16.94f, 16.95f)
                lineTo(15.88f, 15.89f)
                moveTo(17.5f, 12f)
                verticalLineTo(11f)
                horizontalLineTo(19f)
                verticalLineTo(12f)
                horizontalLineTo(17.5f)
                moveTo(12f, 6.5f)
                horizontalLineTo(11f)
                verticalLineTo(5f)
                horizontalLineTo(12f)
                verticalLineTo(6.5f)
                moveTo(8.12f, 8.11f)
                lineTo(7.41f, 8.82f)
                lineTo(6.35f, 7.76f)
                lineTo(7.06f, 7.05f)
                lineTo(8.12f, 8.11f)
                moveTo(6.5f, 12f)
                verticalLineTo(13f)
                horizontalLineTo(5f)
                verticalLineTo(12f)
                horizontalLineTo(6.5f)
                close()
            }
        }.build()

        return _AppleSafari!!
    }

@Suppress("ObjectPropertyName")
private var _AppleSafari: ImageVector? = null
