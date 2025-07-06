package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PowerSettings: ImageVector
    get() {
        if (_PowerSettings != null) {
            return _PowerSettings!!
        }
        _PowerSettings = ImageVector.Builder(
            name = "PowerSettings",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 24f)
                horizontalLineTo(17f)
                verticalLineTo(22f)
                horizontalLineTo(15f)
                moveTo(16.56f, 4.44f)
                lineTo(15.11f, 5.89f)
                curveTo(16.84f, 6.94f, 18f, 8.83f, 18f, 11f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 17f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 11f)
                curveTo(6f, 8.83f, 7.16f, 6.94f, 8.88f, 5.88f)
                lineTo(7.44f, 4.44f)
                curveTo(5.36f, 5.88f, 4f, 8.28f, 4f, 11f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 19f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 11f)
                curveTo(20f, 8.28f, 18.64f, 5.88f, 16.56f, 4.44f)
                moveTo(13f, 2f)
                horizontalLineTo(11f)
                verticalLineTo(12f)
                horizontalLineTo(13f)
                moveTo(11f, 24f)
                horizontalLineTo(13f)
                verticalLineTo(22f)
                horizontalLineTo(11f)
                moveTo(7f, 24f)
                horizontalLineTo(9f)
                verticalLineTo(22f)
                horizontalLineTo(7f)
                verticalLineTo(24f)
                close()
            }
        }.build()

        return _PowerSettings!!
    }

@Suppress("ObjectPropertyName")
private var _PowerSettings: ImageVector? = null
