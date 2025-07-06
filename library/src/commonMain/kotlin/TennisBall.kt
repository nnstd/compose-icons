package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TennisBall: ImageVector
    get() {
        if (_TennisBall != null) {
            return _TennisBall!!
        }
        _TennisBall = ImageVector.Builder(
            name = "TennisBall",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                curveTo(14.5f, 2f, 16.75f, 2.9f, 18.5f, 4.4f)
                curveTo(16.36f, 6.23f, 15f, 8.96f, 15f, 12f)
                curveTo(15f, 15.04f, 16.36f, 17.77f, 18.5f, 19.6f)
                curveTo(16.75f, 21.1f, 14.5f, 22f, 12f, 22f)
                curveTo(9.5f, 22f, 7.25f, 21.1f, 5.5f, 19.6f)
                curveTo(7.64f, 17.77f, 9f, 15.04f, 9f, 12f)
                curveTo(9f, 8.96f, 7.64f, 6.23f, 5.5f, 4.4f)
                curveTo(7.25f, 2.9f, 9.5f, 2f, 12f, 2f)
                moveTo(22f, 12f)
                curveTo(22f, 14.32f, 21.21f, 16.45f, 19.88f, 18.15f)
                curveTo(18.12f, 16.68f, 17f, 14.47f, 17f, 12f)
                curveTo(17f, 9.53f, 18.12f, 7.32f, 19.88f, 5.85f)
                curveTo(21.21f, 7.55f, 22f, 9.68f, 22f, 12f)
                moveTo(2f, 12f)
                curveTo(2f, 9.68f, 2.79f, 7.55f, 4.12f, 5.85f)
                curveTo(5.88f, 7.32f, 7f, 9.53f, 7f, 12f)
                curveTo(7f, 14.47f, 5.88f, 16.68f, 4.12f, 18.15f)
                curveTo(2.79f, 16.45f, 2f, 14.32f, 2f, 12f)
                close()
            }
        }.build()

        return _TennisBall!!
    }

@Suppress("ObjectPropertyName")
private var _TennisBall: ImageVector? = null
