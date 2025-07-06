package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LocationExit: ImageVector
    get() {
        if (_LocationExit != null) {
            return _LocationExit!!
        }
        _LocationExit = ImageVector.Builder(
            name = "LocationExit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 12f)
                lineTo(18f, 8f)
                verticalLineTo(11f)
                horizontalLineTo(10f)
                verticalLineTo(13f)
                horizontalLineTo(18f)
                verticalLineTo(16f)
                moveTo(20f, 18f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, 20f, 6f)
                horizontalLineTo(17.27f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 17.27f, 18f)
                close()
            }
        }.build()

        return _LocationExit!!
    }

@Suppress("ObjectPropertyName")
private var _LocationExit: ImageVector? = null
