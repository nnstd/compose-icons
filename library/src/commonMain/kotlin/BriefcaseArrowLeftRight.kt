package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BriefcaseArrowLeftRight: ImageVector
    get() {
        if (_BriefcaseArrowLeftRight != null) {
            return _BriefcaseArrowLeftRight!!
        }
        _BriefcaseArrowLeftRight = ImageVector.Builder(
            name = "BriefcaseArrowLeftRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 2f)
                horizontalLineTo(14f)
                curveTo(15.11f, 2f, 16f, 2.9f, 16f, 4f)
                verticalLineTo(6f)
                horizontalLineTo(20f)
                curveTo(21.11f, 6f, 22f, 6.9f, 22f, 8f)
                verticalLineTo(13.53f)
                curveTo(20.94f, 12.58f, 19.54f, 12f, 18f, 12f)
                curveTo(14.69f, 12f, 12f, 14.69f, 12f, 18f)
                curveTo(12f, 19.09f, 12.29f, 20.12f, 12.8f, 21f)
                horizontalLineTo(4f)
                curveTo(2.89f, 21f, 2f, 20.1f, 2f, 19f)
                verticalLineTo(8f)
                curveTo(2f, 6.89f, 2.89f, 6f, 4f, 6f)
                horizontalLineTo(8f)
                verticalLineTo(4f)
                curveTo(8f, 2.89f, 8.89f, 2f, 10f, 2f)
                moveTo(14f, 6f)
                verticalLineTo(4f)
                horizontalLineTo(10f)
                verticalLineTo(6f)
                horizontalLineTo(14f)
                moveTo(19f, 18.5f)
                verticalLineTo(17f)
                horizontalLineTo(15f)
                verticalLineTo(15f)
                horizontalLineTo(19f)
                verticalLineTo(13.5f)
                lineTo(22f, 16f)
                lineTo(19f, 18.5f)
                moveTo(17f, 19f)
                horizontalLineTo(21f)
                verticalLineTo(21f)
                horizontalLineTo(17f)
                verticalLineTo(22.5f)
                lineTo(14f, 20f)
                lineTo(17f, 17.5f)
                verticalLineTo(19f)
                close()
            }
        }.build()

        return _BriefcaseArrowLeftRight!!
    }

@Suppress("ObjectPropertyName")
private var _BriefcaseArrowLeftRight: ImageVector? = null
