package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BriefcaseDownload: ImageVector
    get() {
        if (_BriefcaseDownload != null) {
            return _BriefcaseDownload!!
        }
        _BriefcaseDownload = ImageVector.Builder(
            name = "BriefcaseDownload",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 2f)
                horizontalLineTo(14f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 4f)
                verticalLineTo(6f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 8f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 21f)
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
                moveTo(12f, 19f)
                lineTo(17f, 14f)
                horizontalLineTo(14f)
                verticalLineTo(10f)
                horizontalLineTo(10f)
                verticalLineTo(14f)
                horizontalLineTo(7f)
                lineTo(12f, 19f)
                close()
            }
        }.build()

        return _BriefcaseDownload!!
    }

@Suppress("ObjectPropertyName")
private var _BriefcaseDownload: ImageVector? = null
