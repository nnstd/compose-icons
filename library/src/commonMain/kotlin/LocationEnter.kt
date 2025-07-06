package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LocationEnter: ImageVector
    get() {
        if (_LocationEnter != null) {
            return _LocationEnter!!
        }
        _LocationEnter = ImageVector.Builder(
            name = "LocationEnter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 12f)
                lineTo(10f, 8f)
                verticalLineTo(11f)
                horizontalLineTo(2f)
                verticalLineTo(13f)
                horizontalLineTo(10f)
                verticalLineTo(16f)
                moveTo(22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.46f, 15f)
                horizontalLineTo(4.59f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4.59f, 9f)
                horizontalLineTo(2.46f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 12f)
                close()
            }
        }.build()

        return _LocationEnter!!
    }

@Suppress("ObjectPropertyName")
private var _LocationEnter: ImageVector? = null
