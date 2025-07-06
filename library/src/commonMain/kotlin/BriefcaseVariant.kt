package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BriefcaseVariant: ImageVector
    get() {
        if (_BriefcaseVariant != null) {
            return _BriefcaseVariant!!
        }
        _BriefcaseVariant = ImageVector.Builder(
            name = "BriefcaseVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 16f)
                verticalLineTo(15f)
                horizontalLineTo(3f)
                lineTo(3f, 19f)
                curveTo(3f, 20.11f, 3.89f, 21f, 5f, 21f)
                horizontalLineTo(19f)
                curveTo(20.11f, 21f, 21f, 20.11f, 21f, 19f)
                verticalLineTo(15f)
                horizontalLineTo(14f)
                verticalLineTo(16f)
                horizontalLineTo(10f)
                moveTo(20f, 7f)
                horizontalLineTo(16f)
                verticalLineTo(5f)
                lineTo(14f, 3f)
                horizontalLineTo(10f)
                lineTo(8f, 5f)
                verticalLineTo(7f)
                horizontalLineTo(4f)
                curveTo(2.9f, 7f, 2f, 7.9f, 2f, 9f)
                verticalLineTo(12f)
                curveTo(2f, 13.11f, 2.89f, 14f, 4f, 14f)
                horizontalLineTo(10f)
                verticalLineTo(12f)
                horizontalLineTo(14f)
                verticalLineTo(14f)
                horizontalLineTo(20f)
                curveTo(21.1f, 14f, 22f, 13.1f, 22f, 12f)
                verticalLineTo(9f)
                curveTo(22f, 7.9f, 21.1f, 7f, 20f, 7f)
                moveTo(14f, 7f)
                horizontalLineTo(10f)
                verticalLineTo(5f)
                horizontalLineTo(14f)
                verticalLineTo(7f)
                close()
            }
        }.build()

        return _BriefcaseVariant!!
    }

@Suppress("ObjectPropertyName")
private var _BriefcaseVariant: ImageVector? = null
