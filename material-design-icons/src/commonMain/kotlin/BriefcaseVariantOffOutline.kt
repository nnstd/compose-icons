package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BriefcaseVariantOffOutline: ImageVector
    get() {
        if (_BriefcaseVariantOffOutline != null) {
            return _BriefcaseVariantOffOutline!!
        }
        _BriefcaseVariantOffOutline = ImageVector.Builder(
            name = "BriefcaseVariantOffOutline",
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
                verticalLineTo(14f)
                curveTo(22f, 14.73f, 21.59f, 15.37f, 21f, 15.72f)
                verticalLineTo(17.8f)
                lineTo(17.2f, 14f)
                horizontalLineTo(20f)
                verticalLineTo(9f)
                horizontalLineTo(12.2f)
                lineTo(10.2f, 7f)
                horizontalLineTo(14f)
                verticalLineTo(5f)
                horizontalLineTo(10f)
                verticalLineTo(6.8f)
                moveTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                lineTo(19.1f, 21f)
                curveTo(19.07f, 21f, 19.03f, 21f, 19f, 21f)
                horizontalLineTo(5f)
                curveTo(3.89f, 21f, 3f, 20.11f, 3f, 19f)
                verticalLineTo(15.73f)
                curveTo(2.4f, 15.38f, 2f, 14.75f, 2f, 14f)
                verticalLineTo(9f)
                curveTo(2f, 7.9f, 2.9f, 7f, 4f, 7f)
                horizontalLineTo(5.11f)
                lineTo(1.11f, 3f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                moveTo(11f, 15f)
                horizontalLineTo(13f)
                verticalLineTo(14.89f)
                lineTo(11.11f, 13f)
                horizontalLineTo(11f)
                verticalLineTo(15f)
                moveTo(9f, 14f)
                verticalLineTo(11f)
                horizontalLineTo(9.11f)
                lineTo(7.11f, 9f)
                horizontalLineTo(4f)
                verticalLineTo(14f)
                horizontalLineTo(9f)
                moveTo(17.11f, 19f)
                lineTo(15f, 16.89f)
                verticalLineTo(17f)
                horizontalLineTo(9f)
                verticalLineTo(16f)
                horizontalLineTo(5f)
                verticalLineTo(19f)
                horizontalLineTo(17.11f)
                close()
            }
        }.build()

        return _BriefcaseVariantOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BriefcaseVariantOffOutline: ImageVector? = null
