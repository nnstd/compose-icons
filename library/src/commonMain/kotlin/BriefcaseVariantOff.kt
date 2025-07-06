package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BriefcaseVariantOff: ImageVector
    get() {
        if (_BriefcaseVariantOff != null) {
            return _BriefcaseVariantOff!!
        }
        _BriefcaseVariantOff = ImageVector.Builder(
            name = "BriefcaseVariantOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 6.8f)
                lineTo(8.1f, 4.9f)
                lineTo(10f, 3f)
                horizontalLineTo(14f)
                lineTo(16f, 5f)
                verticalLineTo(7f)
                horizontalLineTo(20f)
                curveTo(21.1f, 7f, 22f, 7.9f, 22f, 9f)
                verticalLineTo(12f)
                curveTo(22f, 13.1f, 21.1f, 14f, 20f, 14f)
                horizontalLineTo(17.2f)
                lineTo(10.2f, 7f)
                horizontalLineTo(14f)
                verticalLineTo(5f)
                horizontalLineTo(10f)
                verticalLineTo(6.8f)
                moveTo(2.39f, 1.73f)
                lineTo(1.11f, 3f)
                lineTo(5.11f, 7f)
                horizontalLineTo(4f)
                curveTo(2.9f, 7f, 2f, 7.9f, 2f, 9f)
                verticalLineTo(12f)
                curveTo(2f, 13.11f, 2.89f, 14f, 4f, 14f)
                horizontalLineTo(10f)
                verticalLineTo(12f)
                horizontalLineTo(10.11f)
                lineTo(14f, 15.89f)
                verticalLineTo(16f)
                horizontalLineTo(10f)
                verticalLineTo(15f)
                horizontalLineTo(3f)
                verticalLineTo(19f)
                curveTo(3f, 20.11f, 3.89f, 21f, 5f, 21f)
                horizontalLineTo(19f)
                curveTo(19.03f, 21f, 19.07f, 21f, 19.1f, 21f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                moveTo(21f, 17.8f)
                verticalLineTo(15f)
                horizontalLineTo(18.2f)
                lineTo(21f, 17.8f)
                close()
            }
        }.build()

        return _BriefcaseVariantOff!!
    }

@Suppress("ObjectPropertyName")
private var _BriefcaseVariantOff: ImageVector? = null
