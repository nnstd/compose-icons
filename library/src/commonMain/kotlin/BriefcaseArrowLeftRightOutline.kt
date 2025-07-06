package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BriefcaseArrowLeftRightOutline: ImageVector
    get() {
        if (_BriefcaseArrowLeftRightOutline != null) {
            return _BriefcaseArrowLeftRightOutline!!
        }
        _BriefcaseArrowLeftRightOutline = ImageVector.Builder(
            name = "BriefcaseArrowLeftRightOutline",
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
                curveTo(21.42f, 13f, 20.75f, 12.6f, 20f, 12.34f)
                verticalLineTo(8f)
                horizontalLineTo(4f)
                verticalLineTo(19f)
                horizontalLineTo(12.08f)
                curveTo(12.2f, 19.72f, 12.45f, 20.39f, 12.8f, 21f)
                horizontalLineTo(4f)
                curveTo(2.9f, 21f, 2f, 20.11f, 2f, 19f)
                verticalLineTo(8f)
                curveTo(2f, 6.9f, 2.9f, 6f, 4f, 6f)
                horizontalLineTo(8f)
                verticalLineTo(4f)
                curveTo(8f, 2.9f, 8.9f, 2f, 10f, 2f)
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

        return _BriefcaseArrowLeftRightOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BriefcaseArrowLeftRightOutline: ImageVector? = null
