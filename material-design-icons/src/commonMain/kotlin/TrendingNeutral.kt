package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TrendingNeutral: ImageVector
    get() {
        if (_TrendingNeutral != null) {
            return _TrendingNeutral!!
        }
        _TrendingNeutral = ImageVector.Builder(
            name = "TrendingNeutral",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 12f)
                lineTo(18f, 8f)
                verticalLineTo(11f)
                horizontalLineTo(3f)
                verticalLineTo(13f)
                horizontalLineTo(18f)
                verticalLineTo(16f)
                lineTo(22f, 12f)
                close()
            }
        }.build()

        return _TrendingNeutral!!
    }

@Suppress("ObjectPropertyName")
private var _TrendingNeutral: ImageVector? = null
