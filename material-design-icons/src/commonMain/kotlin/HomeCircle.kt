package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HomeCircle: ImageVector
    get() {
        if (_HomeCircle != null) {
            return _HomeCircle!!
        }
        _HomeCircle = ImageVector.Builder(
            name = "HomeCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.07f, 4.93f)
                curveTo(17.22f, 3f, 14.66f, 1.96f, 12f, 2f)
                curveTo(9.34f, 1.96f, 6.79f, 3f, 4.94f, 4.93f)
                curveTo(3f, 6.78f, 1.96f, 9.34f, 2f, 12f)
                curveTo(1.96f, 14.66f, 3f, 17.21f, 4.93f, 19.06f)
                curveTo(6.78f, 21f, 9.34f, 22.04f, 12f, 22f)
                curveTo(14.66f, 22.04f, 17.21f, 21f, 19.06f, 19.07f)
                curveTo(21f, 17.22f, 22.04f, 14.66f, 22f, 12f)
                curveTo(22.04f, 9.34f, 21f, 6.78f, 19.07f, 4.93f)
                moveTo(17f, 12f)
                verticalLineTo(18f)
                horizontalLineTo(13.5f)
                verticalLineTo(13f)
                horizontalLineTo(10.5f)
                verticalLineTo(18f)
                horizontalLineTo(7f)
                verticalLineTo(12f)
                horizontalLineTo(5f)
                lineTo(12f, 5f)
                lineTo(19.5f, 12f)
                horizontalLineTo(17f)
                close()
            }
        }.build()

        return _HomeCircle!!
    }

@Suppress("ObjectPropertyName")
private var _HomeCircle: ImageVector? = null
