package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ChartBellCurveCumulative: ImageVector
    get() {
        if (_ChartBellCurveCumulative != null) {
            return _ChartBellCurveCumulative!!
        }
        _ChartBellCurveCumulative = ImageVector.Builder(
            name = "ChartBellCurveCumulative",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 19f)
                verticalLineTo(20f)
                horizontalLineTo(22f)
                verticalLineTo(22f)
                horizontalLineTo(2f)
                verticalLineTo(2f)
                horizontalLineTo(4f)
                verticalLineTo(17f)
                curveTo(7f, 17f, 10f, 15f, 12.1f, 11.4f)
                curveTo(15.1f, 6.4f, 18.4f, 4f, 22f, 4f)
                verticalLineTo(6f)
                curveTo(19.2f, 6f, 16.5f, 8.1f, 13.9f, 12.5f)
                curveTo(11.3f, 16.6f, 7.7f, 19f, 4f, 19f)
                close()
            }
        }.build()

        return _ChartBellCurveCumulative!!
    }

@Suppress("ObjectPropertyName")
private var _ChartBellCurveCumulative: ImageVector? = null
