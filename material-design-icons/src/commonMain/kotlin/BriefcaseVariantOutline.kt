package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BriefcaseVariantOutline: ImageVector
    get() {
        if (_BriefcaseVariantOutline != null) {
            return _BriefcaseVariantOutline!!
        }
        _BriefcaseVariantOutline = ImageVector.Builder(
            name = "BriefcaseVariantOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 7f)
                horizontalLineTo(16f)
                verticalLineTo(5f)
                lineTo(14f, 3f)
                horizontalLineTo(10f)
                lineTo(8f, 5f)
                verticalLineTo(7f)
                horizontalLineTo(4f)
                curveTo(2.9f, 7f, 2f, 7.9f, 2f, 9f)
                verticalLineTo(14f)
                curveTo(2f, 14.75f, 2.4f, 15.38f, 3f, 15.73f)
                verticalLineTo(19f)
                curveTo(3f, 20.11f, 3.89f, 21f, 5f, 21f)
                horizontalLineTo(19f)
                curveTo(20.11f, 21f, 21f, 20.11f, 21f, 19f)
                verticalLineTo(15.72f)
                curveTo(21.59f, 15.37f, 22f, 14.73f, 22f, 14f)
                verticalLineTo(9f)
                curveTo(22f, 7.9f, 21.1f, 7f, 20f, 7f)
                moveTo(10f, 5f)
                horizontalLineTo(14f)
                verticalLineTo(7f)
                horizontalLineTo(10f)
                verticalLineTo(5f)
                moveTo(4f, 9f)
                horizontalLineTo(20f)
                verticalLineTo(14f)
                horizontalLineTo(15f)
                verticalLineTo(11f)
                horizontalLineTo(9f)
                verticalLineTo(14f)
                horizontalLineTo(4f)
                verticalLineTo(9f)
                moveTo(13f, 15f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                horizontalLineTo(13f)
                verticalLineTo(15f)
                moveTo(19f, 19f)
                horizontalLineTo(5f)
                verticalLineTo(16f)
                horizontalLineTo(9f)
                verticalLineTo(17f)
                horizontalLineTo(15f)
                verticalLineTo(16f)
                horizontalLineTo(19f)
                verticalLineTo(19f)
                close()
            }
        }.build()

        return _BriefcaseVariantOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BriefcaseVariantOutline: ImageVector? = null
