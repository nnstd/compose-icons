package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileClockOutline: ImageVector
    get() {
        if (_FileClockOutline != null) {
            return _FileClockOutline!!
        }
        _FileClockOutline = ImageVector.Builder(
            name = "FileClockOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 4f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 22f)
                horizontalLineTo(12.41f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 23f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 16f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 9.3f)
                verticalLineTo(8f)
                lineTo(12f, 2f)
                horizontalLineTo(4f)
                moveTo(4f, 4f)
                horizontalLineTo(11f)
                verticalLineTo(9f)
                horizontalLineTo(16f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 16f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.26f, 20f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                moveTo(16f, 11f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 16f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 21f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 16f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 11f)
                moveTo(15f, 12f)
                verticalLineTo(17f)
                lineTo(18.61f, 19.16f)
                lineTo(19.36f, 17.94f)
                lineTo(16.5f, 16.25f)
                verticalLineTo(12f)
                horizontalLineTo(15f)
                close()
            }
        }.build()

        return _FileClockOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FileClockOutline: ImageVector? = null
