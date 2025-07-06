package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HomeLightbulb: ImageVector
    get() {
        if (_HomeLightbulb != null) {
            return _HomeLightbulb!!
        }
        _HomeLightbulb = ImageVector.Builder(
            name = "HomeLightbulb",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 3f)
                lineTo(2f, 12f)
                horizontalLineTo(5f)
                verticalLineTo(20f)
                horizontalLineTo(19f)
                verticalLineTo(12f)
                horizontalLineTo(22f)
                moveTo(13f, 18f)
                horizontalLineTo(11f)
                verticalLineTo(17f)
                horizontalLineTo(13f)
                moveTo(13.5f, 14.58f)
                verticalLineTo(16f)
                horizontalLineTo(10.5f)
                verticalLineTo(14.58f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, 13.5f, 14.58f)
                close()
            }
        }.build()

        return _HomeLightbulb!!
    }

@Suppress("ObjectPropertyName")
private var _HomeLightbulb: ImageVector? = null
