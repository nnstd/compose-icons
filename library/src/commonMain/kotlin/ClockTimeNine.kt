package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ClockTimeNine: ImageVector
    get() {
        if (_ClockTimeNine != null) {
            return _ClockTimeNine!!
        }
        _ClockTimeNine = ImageVector.Builder(
            name = "ClockTimeNine",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                curveTo(6.5f, 2f, 2f, 6.5f, 2f, 12f)
                curveTo(2f, 17.5f, 6.5f, 22f, 12f, 22f)
                curveTo(17.5f, 22f, 22f, 17.5f, 22f, 12f)
                reflectiveCurveTo(17.5f, 2f, 12f, 2f)
                moveTo(12.5f, 13f)
                horizontalLineTo(7f)
                verticalLineTo(11.5f)
                horizontalLineTo(11f)
                verticalLineTo(7f)
                horizontalLineTo(12.5f)
                verticalLineTo(13f)
                close()
            }
        }.build()

        return _ClockTimeNine!!
    }

@Suppress("ObjectPropertyName")
private var _ClockTimeNine: ImageVector? = null
