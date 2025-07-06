package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ClipboardFlowOutline: ImageVector
    get() {
        if (_ClipboardFlowOutline != null) {
            return _ClipboardFlowOutline!!
        }
        _ClipboardFlowOutline = ImageVector.Builder(
            name = "ClipboardFlowOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 3f)
                horizontalLineTo(14.82f)
                curveTo(14.4f, 1.84f, 13.3f, 1f, 12f, 1f)
                reflectiveCurveTo(9.6f, 1.84f, 9.18f, 3f)
                horizontalLineTo(5f)
                curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 20.11f, 3.9f, 21f, 5f, 21f)
                horizontalLineTo(19f)
                curveTo(20.11f, 21f, 21f, 20.11f, 21f, 19f)
                verticalLineTo(5f)
                curveTo(21f, 3.9f, 20.11f, 3f, 19f, 3f)
                moveTo(12f, 3f)
                curveTo(12.55f, 3f, 13f, 3.45f, 13f, 4f)
                reflectiveCurveTo(12.55f, 5f, 12f, 5f)
                reflectiveCurveTo(11f, 4.55f, 11f, 4f)
                reflectiveCurveTo(11.45f, 3f, 12f, 3f)
                moveTo(7f, 7f)
                horizontalLineTo(17f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                verticalLineTo(19f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(7f)
                verticalLineTo(7f)
                moveTo(10f, 16f)
                horizontalLineTo(8f)
                verticalLineTo(11f)
                horizontalLineTo(6f)
                lineTo(9f, 8f)
                lineTo(12f, 11f)
                horizontalLineTo(10f)
                verticalLineTo(16f)
                moveTo(14f, 10f)
                horizontalLineTo(16f)
                verticalLineTo(15f)
                horizontalLineTo(18f)
                lineTo(15f, 18f)
                lineTo(12f, 15f)
                horizontalLineTo(14f)
                verticalLineTo(10f)
                close()
            }
        }.build()

        return _ClipboardFlowOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ClipboardFlowOutline: ImageVector? = null
