package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BriefcaseOff: ImageVector
    get() {
        if (_BriefcaseOff != null) {
            return _BriefcaseOff!!
        }
        _BriefcaseOff = ImageVector.Builder(
            name = "BriefcaseOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                lineTo(19.11f, 21f)
                horizontalLineTo(4f)
                curveTo(2.89f, 21f, 2f, 20.1f, 2f, 19f)
                verticalLineTo(8f)
                curveTo(2f, 6.89f, 2.89f, 6f, 4f, 6f)
                horizontalLineTo(4.11f)
                lineTo(1.11f, 3f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                moveTo(22f, 18.8f)
                lineTo(8f, 4.8f)
                verticalLineTo(4f)
                curveTo(8f, 2.89f, 8.89f, 2f, 10f, 2f)
                horizontalLineTo(14f)
                curveTo(15.11f, 2f, 16f, 2.9f, 16f, 4f)
                verticalLineTo(6f)
                horizontalLineTo(20f)
                curveTo(21.11f, 6f, 22f, 6.9f, 22f, 8f)
                verticalLineTo(18.8f)
                moveTo(14f, 4f)
                horizontalLineTo(10f)
                verticalLineTo(6f)
                horizontalLineTo(14f)
                verticalLineTo(4f)
                close()
            }
        }.build()

        return _BriefcaseOff!!
    }

@Suppress("ObjectPropertyName")
private var _BriefcaseOff: ImageVector? = null
