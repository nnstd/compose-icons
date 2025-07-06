package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HockeyPuck: ImageVector
    get() {
        if (_HockeyPuck != null) {
            return _HockeyPuck!!
        }
        _HockeyPuck = ImageVector.Builder(
            name = "HockeyPuck",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 5f)
                curveTo(6.5f, 5f, 2f, 6.57f, 2f, 8.5f)
                curveTo(2f, 10.43f, 6.5f, 12f, 12f, 12f)
                curveTo(17.5f, 12f, 22f, 10.43f, 22f, 8.5f)
                curveTo(22f, 6.57f, 17.5f, 5f, 12f, 5f)
                moveTo(2f, 11.76f)
                verticalLineTo(16.5f)
                curveTo(2f, 18.43f, 6.5f, 20f, 12f, 20f)
                curveTo(17.5f, 20f, 22f, 18.43f, 22f, 16.5f)
                verticalLineTo(11.76f)
                curveTo(21.33f, 12.22f, 20.58f, 12.57f, 19.73f, 12.86f)
                curveTo(17.62f, 13.6f, 14.95f, 14f, 12f, 14f)
                curveTo(9.05f, 14f, 6.38f, 13.6f, 4.27f, 12.86f)
                curveTo(3.42f, 12.57f, 2.67f, 12.22f, 2f, 11.76f)
                close()
            }
        }.build()

        return _HockeyPuck!!
    }

@Suppress("ObjectPropertyName")
private var _HockeyPuck: ImageVector? = null
