package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HomeAnalytics: ImageVector
    get() {
        if (_HomeAnalytics != null) {
            return _HomeAnalytics!!
        }
        _HomeAnalytics = ImageVector.Builder(
            name = "HomeAnalytics",
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
                moveTo(9f, 18f)
                horizontalLineTo(7f)
                verticalLineTo(12f)
                horizontalLineTo(9f)
                moveTo(13f, 18f)
                horizontalLineTo(11f)
                verticalLineTo(10f)
                horizontalLineTo(13f)
                moveTo(17f, 18f)
                horizontalLineTo(15f)
                verticalLineTo(14f)
                horizontalLineTo(17f)
            }
        }.build()

        return _HomeAnalytics!!
    }

@Suppress("ObjectPropertyName")
private var _HomeAnalytics: ImageVector? = null
